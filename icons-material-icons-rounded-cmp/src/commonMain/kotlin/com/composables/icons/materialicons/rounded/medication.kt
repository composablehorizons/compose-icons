package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Medication: ImageVector
    get() {
        if (_Medication != null) return _Medication!!
        
        _Medication = ImageVector.Builder(
            name = "medication",
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
                        moveTo(17f, 3f)
                        horizontalLineTo(7f)
                        curveTo(6.45f, 3f, 6f, 3.45f, 6f, 4f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(10f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(0f)
                        curveTo(18f, 3.45f, 17.55f, 3f, 17f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 6f)
                        horizontalLineTo(7f)
                        curveTo(5.9f, 6f, 5f, 6.9f, 5f, 8f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(10f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        curveTo(19f, 6.9f, 18.1f, 6f, 17f, 6f)
                        close()
                        moveTo(14.5f, 15f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(1f)
                        curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(-1f)
                        curveTo(8.67f, 15f, 8f, 14.33f, 8f, 13.5f)
                        verticalLineToRelative(0f)
                        curveTo(8f, 12.67f, 8.67f, 12f, 9.5f, 12f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(1f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        verticalLineToRelative(0f)
                        curveTo(16f, 14.33f, 15.33f, 15f, 14.5f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Medication!!
    }

private var _Medication: ImageVector? = null

