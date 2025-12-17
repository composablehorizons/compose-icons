package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Dashboard_customize: ImageVector
    get() {
        if (_Dashboard_customize != null) return _Dashboard_customize!!
        
        _Dashboard_customize = ImageVector.Builder(
            name = "dashboard_customize",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(5f, 15f)
                        horizontalLineTo(9f)
                        verticalLineTo(19f)
                        horizontalLineTo(5f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 5f)
                        horizontalLineTo(9f)
                        verticalLineTo(9f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15f, 5f)
                        horizontalLineTo(19f)
                        verticalLineTo(9f)
                        horizontalLineTo(15f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 11f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(3f)
                        horizontalLineTo(3f)
                        verticalLineTo(11f)
                        close()
                        moveTo(5f, 5f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13f, 3f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(3f)
                        horizontalLineTo(13f)
                        close()
                        moveTo(19f, 9f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3f, 21f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(-8f)
                        horizontalLineTo(3f)
                        verticalLineTo(21f)
                        close()
                        moveTo(5f, 15f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(5f)
                        verticalLineTo(15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 13f)
                        lineTo(16f, 13f)
                        lineTo(16f, 16f)
                        lineTo(13f, 16f)
                        lineTo(13f, 18f)
                        lineTo(16f, 18f)
                        lineTo(16f, 21f)
                        lineTo(18f, 21f)
                        lineTo(18f, 18f)
                        lineTo(21f, 18f)
                        lineTo(21f, 16f)
                        lineTo(18f, 16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Dashboard_customize!!
    }

private var _Dashboard_customize: ImageVector? = null

