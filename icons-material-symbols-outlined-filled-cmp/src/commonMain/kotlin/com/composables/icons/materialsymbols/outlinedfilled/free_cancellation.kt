package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Free_cancellation: ImageVector
    get() {
        if (_Free_cancellation != null) return _Free_cancellation!!
        
        _Free_cancellation = ImageVector.Builder(
            name = "free_cancellation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(662f, 900f)
                lineTo(520f, 758f)
                lineToRelative(56f, -56f)
                lineToRelative(85f, 85f)
                lineToRelative(170f, -170f)
                lineToRelative(56f, 57f)
                lineTo(662f, 900f)
                close()
                moveTo(296f, 680f)
                lineToRelative(-56f, -56f)
                lineToRelative(64f, -64f)
                lineToRelative(-64f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(64f, 64f)
                lineToRelative(64f, -64f)
                lineToRelative(56f, 56f)
                lineToRelative(-64f, 64f)
                lineToRelative(64f, 64f)
                lineToRelative(-56f, 56f)
                lineToRelative(-64f, -64f)
                lineToRelative(-64f, 64f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(254f)
                lineToRelative(-80f, 81f)
                verticalLineToRelative(-175f)
                horizontalLineTo(200f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(250f)
                lineToRelative(79f, 80f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Free_cancellation!!
    }

private var _Free_cancellation: ImageVector? = null

