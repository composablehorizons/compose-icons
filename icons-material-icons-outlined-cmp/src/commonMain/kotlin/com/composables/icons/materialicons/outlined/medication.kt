package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Medication: ImageVector
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
                        moveTo(10.5f, 15f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(2.5f)
                        verticalLineTo(9.5f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(12f)
                        horizontalLineTo(16f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineToRelative(2.5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(15f)
                        close()
                        moveTo(19f, 8f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        horizontalLineTo(7f)
                        curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                        verticalLineTo(8f)
                        curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                        horizontalLineToRelative(10f)
                        curveTo(18.1f, 6f, 19f, 6.9f, 19f, 8f)
                        close()
                        moveTo(17f, 8f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(11f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(8f)
                        close()
                        moveTo(18f, 3f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(3f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Medication!!
    }

private var _Medication: ImageVector? = null

