package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Insert_page_break: ImageVector
    get() {
        if (_Insert_page_break != null) return _Insert_page_break!!
        
        _Insert_page_break = ImageVector.Builder(
            name = "insert_page_break",
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
                        moveTo(4f, 20f)
                        curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                        horizontalLineTo(18f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(4f)
                        lineTo(4f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 8f)
                        lineToRelative(-6f, -6f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 2f, 4.01f, 2.9f, 4.01f, 4f)
                        lineToRelative(0f, 7f)
                        horizontalLineTo(20f)
                        verticalLineTo(8f)
                        close()
                        moveTo(13f, 9f)
                        verticalLineTo(3.5f)
                        lineTo(18.5f, 9f)
                        horizontalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(9f, 13f)
                        horizontalLineTo(15f)
                        verticalLineTo(15f)
                        horizontalLineTo(9f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 13f)
                        horizontalLineTo(23f)
                        verticalLineTo(15f)
                        horizontalLineTo(17f)
                        verticalLineTo(13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(1f, 13f)
                        horizontalLineTo(7f)
                        verticalLineTo(15f)
                        horizontalLineTo(1f)
                        verticalLineTo(13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Insert_page_break!!
    }

private var _Insert_page_break: ImageVector? = null

