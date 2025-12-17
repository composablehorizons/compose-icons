package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dry_cleaning: ImageVector
    get() {
        if (_Dry_cleaning != null) return _Dry_cleaning!!
        
        _Dry_cleaning = ImageVector.Builder(
            name = "dry_cleaning",
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
                        moveTo(21f, 12f)
                        lineToRelative(-8f, -3.56f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(-1f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0f, -1.84f, -1.66f, -3.3f, -3.56f, -2.95f)
                        curveTo(10.26f, 2.27f, 9.29f, 3.22f, 9.06f, 4.4f)
                        curveTo(8.76f, 5.96f, 9.66f, 7.34f, 11f, 7.82f)
                        verticalLineToRelative(0.63f)
                        lineToRelative(-8f, 3.56f)
                        lineTo(3f, 16f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(10f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(12f)
                        close()
                        moveTo(19f, 14f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(1f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-0.7f)
                        lineToRelative(7f, -3.11f)
                        lineToRelative(7f, 3.11f)
                        verticalLineTo(14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Dry_cleaning!!
    }

private var _Dry_cleaning: ImageVector? = null

