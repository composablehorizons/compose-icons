package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Plagiarism: ImageVector
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                        verticalLineToRelative(16f)
                        curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                        horizontalLineTo(18f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        lineTo(14f, 2f)
                        close()
                        moveTo(18f, 20f)
                        lineTo(6f, 20f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(7f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9.03f, 11.03f)
                        curveToRelative(-1.37f, 1.37f, -1.37f, 3.58f, 0f, 4.95f)
                        curveToRelative(1.12f, 1.12f, 2.8f, 1.31f, 4.13f, 0.59f)
                        lineToRelative(1.88f, 1.88f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(-1.88f, -1.88f)
                        curveToRelative(0.71f, -1.33f, 0.53f, -3.01f, -0.59f, -4.13f)
                        curveTo(12.61f, 9.66f, 10.39f, 9.66f, 9.03f, 11.03f)
                        close()
                        moveTo(12.56f, 14.56f)
                        curveToRelative(-0.59f, 0.59f, -1.54f, 0.59f, -2.12f, 0f)
                        curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
                        curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
                        curveTo(13.15f, 13.03f, 13.15f, 13.97f, 12.56f, 14.56f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Plagiarism!!
    }

private var _Plagiarism: ImageVector? = null

