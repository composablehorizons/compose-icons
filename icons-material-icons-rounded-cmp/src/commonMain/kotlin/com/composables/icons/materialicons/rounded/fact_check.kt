package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fact_check: ImageVector
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
                        moveTo(9f, 17f)
                        horizontalLineTo(6f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveTo(10f, 16.55f, 9.55f, 17f, 9f, 17f)
                        close()
                        moveTo(9f, 13f)
                        horizontalLineTo(6f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveTo(10f, 12.55f, 9.55f, 13f, 9f, 13f)
                        close()
                        moveTo(9f, 9f)
                        horizontalLineTo(6f)
                        curveTo(5.45f, 9f, 5f, 8.55f, 5f, 8f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(3f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveTo(10f, 8.55f, 9.55f, 9f, 9f, 9f)
                        close()
                        moveTo(18.7f, 11.12f)
                        lineToRelative(-3.17f, 3.17f)
                        curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.42f, 0f)
                        lineToRelative(-1.41f, -1.42f)
                        curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineToRelative(0.71f, 0.71f)
                        lineToRelative(2.47f, -2.47f)
                        curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                        lineToRelative(0.01f, 0.01f)
                        curveTo(19.09f, 10.1f, 19.09f, 10.74f, 18.7f, 11.12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Fact_check!!
    }

private var _Fact_check: ImageVector? = null

