package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wb_incandescent: ImageVector
    get() {
        if (_Wb_incandescent != null) return _Wb_incandescent!!
        
        _Wb_incandescent = ImageVector.Builder(
            name = "wb_incandescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.25f, 19.79f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.39f, -0.39f)
                curveToRelative(0.39f, -0.39f, 0.38f, -1.02f, 0f, -1.4f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-0.39f, 0.39f)
                curveToRelative(-0.38f, 0.4f, -0.38f, 1.02f, 0.01f, 1.41f)
                close()
                moveTo(11.99f, 23f)
                horizontalLineTo(12f)
                curveToRelative(0.55f, 0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.96f)
                curveToRelative(0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -0.99f, 0.99f)
                verticalLineToRelative(0.96f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                close()
                moveTo(3.01f, 11.05f)
                horizontalLineTo(1.99f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -0.99f, 0.99f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                horizontalLineTo(3f)
                curveToRelative(0.55f, 0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.01f, -0.55f, -0.43f, -0.99f, -0.98f, -0.99f)
                close()
                moveTo(15f, 6.86f)
                verticalLineTo(3.05f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3.81f)
                curveToRelative(-2.04f, 1.18f, -3.32f, 3.52f, -2.93f, 6.13f)
                curveToRelative(0.4f, 2.61f, 2.56f, 4.7f, 5.18f, 5.02f)
                curveToRelative(3.64f, 0.44f, 6.75f, -2.4f, 6.75f, -5.95f)
                curveToRelative(0f, -2.23f, -1.21f, -4.16f, -3f, -5.2f)
                close()
                moveToRelative(5f, 5.18f)
                verticalLineToRelative(0.01f)
                curveToRelative(0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f)
                horizontalLineTo(22f)
                curveToRelative(0.55f, 0f, 0.99f, -0.44f, 0.99f, -0.99f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -0.99f, 0.99f)
                close()
                moveToRelative(-2.06f, 7.37f)
                lineToRelative(0.39f, 0.39f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-0.39f, -0.39f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.38f, -1.4f, 0f)
                curveToRelative(-0.4f, 0.4f, -0.4f, 1.02f, -0.01f, 1.41f)
                close()
            }
        }.build()
        
        return _Wb_incandescent!!
    }

private var _Wb_incandescent: ImageVector? = null

