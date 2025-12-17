package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Plagiarism: ImageVector
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
                        moveTo(13f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 16f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 10f, 14.5f)
                        arcTo(1.5f, 1.5f, 0f, false, true, 13f, 14.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 2f)
                        horizontalLineTo(4f)
                        verticalLineToRelative(20f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(8f)
                        lineTo(14f, 2f)
                        close()
                        moveTo(15.04f, 19.45f)
                        lineToRelative(-1.88f, -1.88f)
                        curveToRelative(-1.33f, 0.71f, -3.01f, 0.53f, -4.13f, -0.59f)
                        curveToRelative(-1.37f, -1.37f, -1.37f, -3.58f, 0f, -4.95f)
                        curveToRelative(1.37f, -1.37f, 3.58f, -1.37f, 4.95f, 0f)
                        curveToRelative(1.12f, 1.12f, 1.31f, 2.8f, 0.59f, 4.13f)
                        lineToRelative(1.88f, 1.88f)
                        lineTo(15.04f, 19.45f)
                        close()
                        moveTo(13f, 9f)
                        verticalLineTo(3.5f)
                        lineTo(18.5f, 9f)
                        horizontalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Plagiarism!!
    }

private var _Plagiarism: ImageVector? = null

