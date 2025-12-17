package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Attach_file: ImageVector
    get() {
        if (_Attach_file != null) return _Attach_file!!
        
        _Attach_file = ImageVector.Builder(
            name = "attach_file",
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
                moveTo(16.5f, 6.75f)
                verticalLineToRelative(10.58f)
                curveToRelative(0f, 2.09f, -1.53f, 3.95f, -3.61f, 4.15f)
                curveToRelative(-2.39f, 0.23f, -4.39f, -1.64f, -4.39f, -3.98f)
                verticalLineTo(5.14f)
                curveToRelative(0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f)
                curveToRelative(1.5f, -0.15f, 2.76f, 1.02f, 2.76f, 2.49f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(6.75f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineToRelative(8.61f)
                curveToRelative(0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineTo(5.17f)
                curveToRelative(0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f)
                curveTo(9.01f, 0.79f, 7f, 2.66f, 7f, 5f)
                verticalLineToRelative(12.27f)
                curveToRelative(0f, 2.87f, 2.1f, 5.44f, 4.96f, 5.71f)
                curveToRelative(3.29f, 0.3f, 6.04f, -2.26f, 6.04f, -5.48f)
                verticalLineTo(6.75f)
                curveToRelative(0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                close()
            }
        }.build()
        
        return _Attach_file!!
    }

private var _Attach_file: ImageVector? = null

