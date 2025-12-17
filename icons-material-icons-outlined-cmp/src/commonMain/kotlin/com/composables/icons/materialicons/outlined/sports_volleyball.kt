package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sports_volleyball: ImageVector
    get() {
        if (_Sports_volleyball != null) return _Sports_volleyball!!
        
        _Sports_volleyball = ImageVector.Builder(
            name = "sports_volleyball",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 2f)
                        curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                        curveToRelative(0f, 5.52f, 4.48f, 10f, 10f, 10f)
                        reflectiveCurveToRelative(10f, -4.48f, 10f, -10f)
                        curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                        close()
                        moveTo(13f, 4.07f)
                        curveToRelative(3.07f, 0.38f, 5.57f, 2.52f, 6.54f, 5.36f)
                        lineTo(13f, 5.65f)
                        verticalLineTo(4.07f)
                        close()
                        moveTo(8f, 5.08f)
                        curveToRelative(1.18f, -0.69f, 3.33f, -1.06f, 3f, -1.02f)
                        verticalLineToRelative(7.35f)
                        lineToRelative(-3f, 1.73f)
                        verticalLineTo(5.08f)
                        close()
                        moveTo(4.63f, 15.1f)
                        curveTo(4.23f, 14.14f, 4f, 13.1f, 4f, 12f)
                        curveToRelative(0f, -2.02f, 0.76f, -3.86f, 2f, -5.27f)
                        verticalLineToRelative(7.58f)
                        lineTo(4.63f, 15.1f)
                        close()
                        moveTo(5.64f, 16.83f)
                        lineTo(12f, 13.15f)
                        lineToRelative(3f, 1.73f)
                        lineToRelative(-6.98f, 4.03f)
                        curveTo(7.09f, 18.38f, 6.28f, 17.68f, 5.64f, 16.83f)
                        close()
                        moveTo(10.42f, 19.84f)
                        moveTo(12f, 20f)
                        curveToRelative(-0.54f, 0f, -1.07f, -0.06f, -1.58f, -0.16f)
                        lineToRelative(6.58f, -3.8f)
                        lineToRelative(1.36f, 0.78f)
                        curveTo(16.9f, 18.75f, 14.6f, 20f, 12f, 20f)
                        close()
                        moveTo(13f, 11.42f)
                        verticalLineTo(7.96f)
                        lineToRelative(7f, 4.05f)
                        curveToRelative(0f, 1.1f, -0.23f, 2.14f, -0.63f, 3.09f)
                        lineTo(13f, 11.42f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_volleyball!!
    }

private var _Sports_volleyball: ImageVector? = null

