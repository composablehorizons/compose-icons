package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Notification_multiple: ImageVector
    get() {
        if (_Notification_multiple != null) return _Notification_multiple!!
        
        _Notification_multiple = ImageVector.Builder(
            name = "notification_multiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 800f)
                verticalLineToRelative(-520f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(600f)
                verticalLineToRelative(80f)
                horizontalLineTo(120f)
                close()
                moveToRelative(160f, -160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 640f)
                verticalLineToRelative(-340f)
                quadToRelative(0f, -21f, 9.5f, -40f)
                reflectiveQuadToRelative(28.5f, -30f)
                lineToRelative(322f, -190f)
                lineToRelative(80f, 47f)
                lineToRelative(-352f, 207f)
                lineToRelative(272f, 160f)
                lineToRelative(270f, -160f)
                quadToRelative(15f, -9f, 30.5f, -8.5f)
                reflectiveQuadTo(890f, 294f)
                quadToRelative(14f, 8f, 22f, 21.5f)
                reflectiveQuadToRelative(8f, 30.5f)
                verticalLineToRelative(294f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 720f)
                horizontalLineTo(280f)
                close()
                moveToRelative(274f, -320f)
                lineTo(442f, 288f)
                lineToRelative(56f, -56f)
                lineToRelative(56f, 56f)
                lineToRelative(142f, -142f)
                lineToRelative(56f, 56f)
                lineToRelative(-198f, 198f)
                close()
            }
        }.build()
        
        return _Notification_multiple!!
    }

private var _Notification_multiple: ImageVector? = null

