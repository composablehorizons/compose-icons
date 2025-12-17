package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Waterfall_chart: ImageVector
    get() {
        if (_Waterfall_chart != null) return _Waterfall_chart!!
        
        _Waterfall_chart = ImageVector.Builder(
            name = "waterfall_chart",
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
                        moveTo(18f, 4f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(4f)
                        close()
                        moveTo(3f, 13f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(7f)
                        horizontalLineTo(3f)
                        verticalLineTo(13f)
                        close()
                        moveTo(14f, 4f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(4f)
                        close()
                        moveTo(10f, 5f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(5f)
                        close()
                        moveTo(7f, 10f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(4f)
                        horizontalLineTo(7f)
                        verticalLineTo(10f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Waterfall_chart!!
    }

private var _Waterfall_chart: ImageVector? = null

