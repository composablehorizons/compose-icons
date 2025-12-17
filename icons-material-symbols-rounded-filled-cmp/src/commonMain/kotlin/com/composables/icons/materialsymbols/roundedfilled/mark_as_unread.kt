package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Mark_as_unread: ImageVector
    get() {
        if (_Mark_as_unread != null) return _Mark_as_unread!!
        
        _Mark_as_unread = ImageVector.Builder(
            name = "mark_as_unread",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-314f)
                quadToRelative(0f, -15f, 8.5f, -29.5f)
                reflectiveQuadTo(112f, 234f)
                lineToRelative(272f, -136f)
                quadToRelative(17f, -8f, 36f, -8.5f)
                reflectiveQuadToRelative(36f, 8.5f)
                lineToRelative(266f, 136f)
                quadToRelative(12f, 6f, 20.5f, 19f)
                reflectiveQuadToRelative(11.5f, 27f)
                horizontalLineTo(637f)
                lineTo(420f, 170f)
                lineTo(160f, 299f)
                verticalLineToRelative(381f)
                close()
                moveToRelative(120f, 160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 760f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 320f)
                horizontalLineToRelative(520f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(280f)
                close()
                moveToRelative(260f, -236f)
                quadToRelative(10f, 0f, 19.5f, -2f)
                reflectiveQuadToRelative(17.5f, -7f)
                lineToRelative(204f, -105f)
                quadToRelative(9f, -5f, 14f, -13.5f)
                reflectiveQuadToRelative(5f, -18.5f)
                quadToRelative(0f, -20f, -17f, -30f)
                reflectiveQuadToRelative(-35f, -1f)
                lineTo(540f, 534f)
                lineTo(332f, 427f)
                quadToRelative(-18f, -9f, -35f, 1f)
                reflectiveQuadToRelative(-17f, 30f)
                quadToRelative(0f, 10f, 5f, 18.5f)
                reflectiveQuadToRelative(14f, 13.5f)
                lineToRelative(204f, 105f)
                quadToRelative(8f, 5f, 17.5f, 7f)
                reflectiveQuadToRelative(19.5f, 2f)
                close()
            }
        }.build()
        
        return _Mark_as_unread!!
    }

private var _Mark_as_unread: ImageVector? = null

