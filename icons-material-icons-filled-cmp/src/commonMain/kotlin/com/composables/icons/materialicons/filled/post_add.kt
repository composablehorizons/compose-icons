package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Post_add: ImageVector
    get() {
        if (_Post_add != null) return _Post_add!!
        
        _Post_add = ImageVector.Builder(
            name = "post_add",
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 19.22f)
                        horizontalLineTo(5f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(7f)
                        verticalLineTo(5f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 5f, 3f, 5.9f, 3f, 7f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-7f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(19.22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-3f)
                        curveToRelative(0.01f, 0.01f, 0f, 2f, 0f, 2f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2.99f)
                        curveToRelative(0.01f, 0.01f, 2f, 0f, 2f, 0f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(2f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 9f)
                        horizontalLineTo(15f)
                        verticalLineTo(11f)
                        horizontalLineTo(7f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 12f)
                        lineTo(7f, 14f)
                        lineTo(15f, 14f)
                        lineTo(15f, 12f)
                        lineTo(12f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 15f)
                        horizontalLineTo(15f)
                        verticalLineTo(17f)
                        horizontalLineTo(7f)
                        verticalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Post_add!!
    }

private var _Post_add: ImageVector? = null

