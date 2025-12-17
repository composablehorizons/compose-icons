package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CheckSquare: ImageVector
    get() {
        if (_CheckSquare != null) return _CheckSquare!!
        
        _CheckSquare = ImageVector.Builder(
            name = "check-square",
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
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                close()
                moveToRelative(-204.686f, -98.059f)
                lineToRelative(184f, -184f)
                curveToRelative(6.248f, -6.248f, 6.248f, -16.379f, 0f, -22.627f)
                lineToRelative(-22.627f, -22.627f)
                curveToRelative(-6.248f, -6.248f, -16.379f, -6.249f, -22.628f, 0f)
                lineTo(184f, 302.745f)
                lineToRelative(-70.059f, -70.059f)
                curveToRelative(-6.248f, -6.248f, -16.379f, -6.248f, -22.628f, 0f)
                lineToRelative(-22.627f, 22.627f)
                curveToRelative(-6.248f, 6.248f, -6.248f, 16.379f, 0f, 22.627f)
                lineToRelative(104f, 104f)
                curveToRelative(6.249f, 6.25f, 16.379f, 6.25f, 22.628f, 0.001f)
                close()
            }
        }.build()
        
        return _CheckSquare!!
    }

private var _CheckSquare: ImageVector? = null

