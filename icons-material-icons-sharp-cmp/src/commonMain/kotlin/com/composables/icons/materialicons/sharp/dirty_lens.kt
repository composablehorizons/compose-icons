package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dirty_lens: ImageVector
    get() {
        if (_Dirty_lens != null) return _Dirty_lens!!
        
        _Dirty_lens = ImageVector.Builder(
            name = "dirty_lens",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 5f)
                    horizontalLineToRelative(-5.17f)
                    lineTo(15f, 3f)
                    horizontalLineTo(9f)
                    lineTo(7.17f, 5f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(5f)
                    close()
                    moveTo(16.66f, 16.58f)
                    curveToRelative(-1.14f, 1.86f, -3f, -1.03f, -3.81f, 0.09f)
                    curveToRelative(-0.39f, 0.57f, -0.09f, 1.49f, 0.13f, 2.33f)
                    curveToRelative(0f, 0.47f, -0.38f, 0.85f, -0.85f, 0.85f)
                    curveToRelative(-0.47f, 0f, -0.86f, -0.38f, -0.86f, -0.85f)
                    curveToRelative(0.14f, -0.98f, 0.42f, -2.05f, -0.16f, -2.43f)
                    curveToRelative(-0.89f, -0.59f, -1.27f, 2.06f, -2.8f, 1.35f)
                    curveToRelative(-1.39f, -1.12f, 1.05f, -1.29f, 0.5f, -3.27f)
                    curveToRelative(-0.22f, -0.79f, -2.28f, 0.36f, -2.4f, -1.24f)
                    curveToRelative(-0.08f, -1f, 1.49f, -0.74f, 1.51f, -1.49f)
                    curveToRelative(0.03f, -0.75f, -1.03f, -1.05f, -0.25f, -1.91f)
                    curveToRelative(0.22f, -0.24f, 0.71f, -0.26f, 0.91f, -0.19f)
                    curveToRelative(0.79f, 0.27f, 1.55f, 1.82f, 2.51f, 1.19f)
                    curveToRelative(1.03f, -0.66f, -1.88f, -2.35f, 0f, -2.86f)
                    curveToRelative(1.64f, -0.44f, 1.31f, 2.08f, 2.65f, 2.44f)
                    curveToRelative(1.94f, 0.52f, 2.65f, -4.55f, 4.41f, -2.33f)
                    curveToRelative(1.85f, 2.33f, -3.43f, 2.27f, -2.85f, 4.01f)
                    curveToRelative(0.34f, 1.01f, 2.15f, -1.2f, 2.76f, 0.53f)
                    curveToRelative(0.64f, 1.83f, -3.09f, 0.82f, -3.04f, 1.66f)
                    curveTo(15.08f, 15.29f, 17.43f, 15.01f, 16.66f, 16.58f)
                    close()
                    moveTo(18.14f, 18.01f)
                    curveToRelative(-0.47f, 0f, -0.86f, -0.38f, -0.86f, -0.86f)
                    reflectiveCurveToRelative(0.38f, -0.86f, 0.86f, -0.86f)
                    curveToRelative(0.47f, 0f, 0.86f, 0.38f, 0.86f, 0.86f)
                    reflectiveCurveTo(18.62f, 18.01f, 18.14f, 18.01f)
                    close()
                }
            }
        }.build()
        
        return _Dirty_lens!!
    }

private var _Dirty_lens: ImageVector? = null

