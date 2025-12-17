package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Price_check: ImageVector
    get() {
        if (_Price_check != null) return _Price_check!!
        
        _Price_check = ImageVector.Builder(
            name = "price_check",
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
                        moveTo(11f, 13f)
                        verticalLineTo(9f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        horizontalLineTo(6f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                        horizontalLineTo(8.5f)
                        curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                        reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                        horizontalLineTo(5f)
                        curveTo(4.45f, 4f, 4f, 4.45f, 4f, 5f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(5f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(1.5f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        horizontalLineTo(10f)
                        curveTo(10.55f, 14f, 11f, 13.55f, 11f, 13f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.88f, 13.22f)
                        lineToRelative(-4.95f, 4.95f)
                        lineToRelative(-2.12f, -2.12f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(2.83f, 2.83f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(5.66f, -5.66f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        verticalLineToRelative(0f)
                        curveTo(19.9f, 12.83f, 19.27f, 12.83f, 18.88f, 13.22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Price_check!!
    }

private var _Price_check: ImageVector? = null

