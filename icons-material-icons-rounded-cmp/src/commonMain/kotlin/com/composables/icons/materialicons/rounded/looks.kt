package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Looks: ImageVector
    get() {
        if (_Looks != null) return _Looks!!
        
        _Looks = ImageVector.Builder(
            name = "looks",
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
                moveTo(12f, 10f)
                curveToRelative(-3.47f, 0f, -6.36f, 2.54f, -6.91f, 5.86f)
                curveToRelative(-0.1f, 0.6f, 0.39f, 1.14f, 1f, 1.14f)
                curveToRelative(0.49f, 0f, 0.9f, -0.36f, 0.98f, -0.85f)
                curveTo(7.48f, 13.79f, 9.53f, 12f, 12f, 12f)
                reflectiveCurveToRelative(4.52f, 1.79f, 4.93f, 4.15f)
                curveToRelative(0.08f, 0.49f, 0.49f, 0.85f, 0.98f, 0.85f)
                curveToRelative(0.61f, 0f, 1.09f, -0.54f, 0.99f, -1.14f)
                curveTo(18.36f, 12.54f, 15.47f, 10f, 12f, 10f)
                close()
                moveToRelative(0f, -4f)
                curveTo(6.3f, 6f, 1.61f, 10.34f, 1.05f, 15.9f)
                curveToRelative(-0.05f, 0.59f, 0.41f, 1.1f, 1.01f, 1.1f)
                curveToRelative(0.51f, 0f, 0.94f, -0.38f, 0.99f, -0.88f)
                curveTo(3.49f, 11.57f, 7.34f, 8f, 12f, 8f)
                reflectiveCurveToRelative(8.51f, 3.57f, 8.96f, 8.12f)
                curveToRelative(0.05f, 0.5f, 0.48f, 0.88f, 0.99f, 0.88f)
                curveToRelative(0.59f, 0f, 1.06f, -0.51f, 1f, -1.1f)
                curveTo(22.39f, 10.34f, 17.7f, 6f, 12f, 6f)
                close()
            }
        }.build()
        
        return _Looks!!
    }

private var _Looks: ImageVector? = null

