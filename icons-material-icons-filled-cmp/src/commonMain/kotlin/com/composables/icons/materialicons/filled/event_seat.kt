package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Event_seat: ImageVector
    get() {
        if (_Event_seat != null) return _Event_seat!!
        
        _Event_seat = ImageVector.Builder(
            name = "event_seat",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(4f, 18f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(10f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(-6f)
                            horizontalLineTo(4f)
                            verticalLineTo(18f)
                            close()
                            moveTo(19f, 10f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(-3f)
                            verticalLineTo(10f)
                            close()
                            moveTo(2f, 10f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(3f)
                            horizontalLineTo(2f)
                            verticalLineTo(10f)
                            close()
                            moveTo(17f, 13f)
                            horizontalLineTo(7f)
                            verticalLineTo(5f)
                            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                            horizontalLineToRelative(6f)
                            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                            verticalLineTo(13f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Event_seat!!
    }

private var _Event_seat: ImageVector? = null

