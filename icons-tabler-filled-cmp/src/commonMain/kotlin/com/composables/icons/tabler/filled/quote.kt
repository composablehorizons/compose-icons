package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Quote: ImageVector
    get() {
        if (_Quote != null) return _Quote!!
        
        _Quote = ImageVector.Builder(
            name = "quote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.13f, -1.65f, 5.193f, -4.757f, 5.97f)
                arcToRelative(1f, 1f, 0f, true, true, -0.486f, -1.94f)
                curveToRelative(2.227f, -0.557f, 3.243f, -1.827f, 3.243f, -4.03f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 5f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 3.13f, -1.65f, 5.193f, -4.757f, 5.97f)
                arcToRelative(1f, 1f, 0f, true, true, -0.486f, -1.94f)
                curveToRelative(2.227f, -0.557f, 3.243f, -1.827f, 3.243f, -4.03f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
        }.build()
        
        return _Quote!!
    }

private var _Quote: ImageVector? = null

