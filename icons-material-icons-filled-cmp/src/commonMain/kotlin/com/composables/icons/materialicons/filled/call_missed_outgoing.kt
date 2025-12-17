package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Call_missed_outgoing: ImageVector
    get() {
        if (_Call_missed_outgoing != null) return _Call_missed_outgoing!!
        
        _Call_missed_outgoing = ImageVector.Builder(
            name = "call_missed_outgoing",
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
                            moveTo(3f, 8.41f)
                            lineToRelative(9f, 9f)
                            lineToRelative(7f, -7f)
                            verticalLineTo(15f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(-8f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(4.59f)
                            lineTo(12f, 14.59f)
                            lineTo(4.41f, 7f)
                            lineTo(3f, 8.41f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Call_missed_outgoing!!
    }

private var _Call_missed_outgoing: ImageVector? = null

