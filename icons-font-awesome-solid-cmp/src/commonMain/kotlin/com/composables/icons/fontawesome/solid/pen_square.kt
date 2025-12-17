package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PenSquare: ImageVector
    get() {
        if (_PenSquare != null) return _PenSquare!!
        
        _PenSquare = ImageVector.Builder(
            name = "pen-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 480f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                close()
                moveTo(238.1f, 177.9f)
                lineTo(102.4f, 313.6f)
                lineToRelative(-6.3f, 57.1f)
                curveToRelative(-0.8f, 7.6f, 5.6f, 14.1f, 13.3f, 13.3f)
                lineToRelative(57.1f, -6.3f)
                lineTo(302.2f, 242f)
                curveToRelative(2.3f, -2.3f, 2.3f, -6.1f, 0f, -8.5f)
                lineTo(246.7f, 178f)
                curveToRelative(-2.5f, -2.4f, -6.3f, -2.4f, -8.6f, -0.1f)
                close()
                moveTo(345f, 165.1f)
                lineTo(314.9f, 135f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineToRelative(-23.1f, 23.1f)
                curveToRelative(-2.3f, 2.3f, -2.3f, 6.1f, 0f, 8.5f)
                lineToRelative(55.5f, 55.5f)
                curveToRelative(2.3f, 2.3f, 6.1f, 2.3f, 8.5f, 0f)
                lineTo(345f, 199f)
                curveToRelative(9.3f, -9.3f, 9.3f, -24.5f, 0f, -33.9f)
                close()
            }
        }.build()
        
        return _PenSquare!!
    }

private var _PenSquare: ImageVector? = null

