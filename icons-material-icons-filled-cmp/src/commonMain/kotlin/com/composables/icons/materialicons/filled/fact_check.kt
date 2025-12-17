package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fact_check: ImageVector
    get() {
        if (_Fact_check != null) return _Fact_check!!
        
        _Fact_check = ImageVector.Builder(
            name = "fact_check",
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
                        moveTo(20f, 3f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                        verticalLineToRelative(14f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                        close()
                        moveTo(10f, 17f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(17f)
                        close()
                        moveTo(10f, 13f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(13f)
                        close()
                        moveTo(10f, 9f)
                        horizontalLineTo(5f)
                        verticalLineTo(7f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(9f)
                        close()
                        moveTo(14.82f, 15f)
                        lineTo(12f, 12.16f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(1.41f, 1.42f)
                        lineTo(17.99f, 9f)
                        lineToRelative(1.42f, 1.42f)
                        lineTo(14.82f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fact_check!!
    }

private var _Fact_check: ImageVector? = null

