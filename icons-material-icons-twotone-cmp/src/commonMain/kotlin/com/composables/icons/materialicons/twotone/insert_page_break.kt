package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Insert_page_break: ImageVector
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
                        moveTo(18f, 11f)
                        lineTo(6f, 11f)
                        lineTo(6f, 4f)
                        lineTo(13f, 4f)
                        lineTo(13f, 9f)
                        lineTo(18f, 9f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(18f, 20f)
                            horizontalLineTo(6f)
                            verticalLineToRelative(-3f)
                            horizontalLineTo(4f)
                            verticalLineToRelative(3f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(12f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(20f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 4f)
                            horizontalLineToRelative(7f)
                            verticalLineToRelative(5f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(8f)
                            lineToRelative(-6f, -6f)
                            horizontalLineTo(6f)
                            curveTo(4.9f, 2f, 4f, 2.9f, 4f, 4f)
                            verticalLineToRelative(7f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(4f)
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
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 17f)
                        horizontalLineTo(18f)
                        verticalLineTo(20f)
                        horizontalLineTo(6f)
                        verticalLineTo(17f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Insert_page_break!!
    }

private var _Insert_page_break: ImageVector? = null

