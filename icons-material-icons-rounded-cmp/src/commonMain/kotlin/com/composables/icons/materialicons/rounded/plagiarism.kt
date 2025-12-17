package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Plagiarism: ImageVector
    get() {
        if (_Plagiarism != null) return _Plagiarism!!
        
        _Plagiarism = ImageVector.Builder(
            name = "plagiarism",
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
                        moveTo(19.41f, 7.41f)
                        lineToRelative(-4.83f, -4.83f)
                        curveTo(14.21f, 2.21f, 13.7f, 2f, 13.17f, 2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8.83f)
                        curveTo(20f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f)
                        close()
                        moveTo(15.74f, 18.74f)
                        lineTo(15.74f, 18.74f)
                        curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                        lineToRelative(-1.18f, -1.18f)
                        curveToRelative(-1.33f, 0.71f, -3.01f, 0.53f, -4.13f, -0.59f)
                        curveToRelative(-1.52f, -1.52f, -1.35f, -4.08f, 0.5f, -5.37f)
                        curveToRelative(1.16f, -0.81f, 2.78f, -0.81f, 3.95f, 0f)
                        curveToRelative(1.55f, 1.08f, 1.9f, 3.04f, 1.09f, 4.55f)
                        lineToRelative(1.18f, 1.18f)
                        curveTo(16.13f, 17.72f, 16.13f, 18.35f, 15.74f, 18.74f)
                        close()
                        moveTo(14f, 9f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(3.5f)
                        lineTo(18.5f, 9f)
                        horizontalLineTo(14f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13f, 14.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Plagiarism!!
    }

private var _Plagiarism: ImageVector? = null

