package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Sports_esports: ImageVector
    get() {
        if (_Sports_esports != null) return _Sports_esports!!
        
        _Sports_esports = ImageVector.Builder(
            name = "sports_esports",
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
                        moveTo(20f, 5f)
                        horizontalLineTo(4f)
                        lineTo(2f, 19f)
                        horizontalLineToRelative(4f)
                        lineToRelative(3f, -3f)
                        horizontalLineToRelative(6f)
                        lineToRelative(3f, 3f)
                        horizontalLineToRelative(4f)
                        lineTo(20f, 5f)
                        close()
                        moveTo(11f, 11f)
                        horizontalLineTo(9f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11f)
                        close()
                        moveTo(15f, 10f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(16f, 9.55f, 15.55f, 10f, 15f, 10f)
                        close()
                        moveTo(17f, 13f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        curveTo(18f, 12.55f, 17.55f, 13f, 17f, 13f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_esports!!
    }

private var _Sports_esports: ImageVector? = null

