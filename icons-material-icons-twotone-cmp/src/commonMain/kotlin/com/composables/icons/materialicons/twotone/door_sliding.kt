package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Door_sliding: ImageVector
    get() {
        if (_Door_sliding != null) return _Door_sliding!!
        
        _Door_sliding = ImageVector.Builder(
            name = "door_sliding",
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
                        moveTo(13f, 19f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(19f)
                        close()
                        moveTo(14f, 11f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 19f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(5f)
                        horizontalLineTo(6f)
                        verticalLineTo(19f)
                        close()
                        moveTo(8f, 11f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(8f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 19f)
                        verticalLineTo(5f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(6f)
                        curveTo(4.9f, 3f, 4f, 3.9f, 4f, 5f)
                        verticalLineToRelative(14f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(18f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(20f)
                        close()
                        moveTo(11f, 19f)
                        horizontalLineTo(6f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(19f)
                        close()
                        moveTo(18f, 19f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 11f)
                        horizontalLineTo(10f)
                        verticalLineTo(13f)
                        horizontalLineTo(8f)
                        verticalLineTo(11f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(14f, 11f)
                        horizontalLineTo(16f)
                        verticalLineTo(13f)
                        horizontalLineTo(14f)
                        verticalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Door_sliding!!
    }

private var _Door_sliding: ImageVector? = null

