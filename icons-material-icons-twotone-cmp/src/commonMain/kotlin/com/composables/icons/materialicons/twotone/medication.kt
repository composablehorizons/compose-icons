package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Medication: ImageVector
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
                        moveTo(7f, 19f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(8f)
                        horizontalLineTo(7f)
                        verticalLineTo(19f)
                        close()
                        moveTo(8f, 12f)
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
                        horizontalLineTo(8f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 3f)
                        horizontalLineTo(18f)
                        verticalLineTo(5f)
                        horizontalLineTo(6f)
                        verticalLineTo(3f)
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
                        moveTo(17f, 19f)
                        horizontalLineTo(7f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.5f, 17.5f)
                        lineTo(13.5f, 17.5f)
                        lineTo(13.5f, 15f)
                        lineTo(16f, 15f)
                        lineTo(16f, 12f)
                        lineTo(13.5f, 12f)
                        lineTo(13.5f, 9.5f)
                        lineTo(10.5f, 9.5f)
                        lineTo(10.5f, 12f)
                        lineTo(8f, 12f)
                        lineTo(8f, 15f)
                        lineTo(10.5f, 15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Medication!!
    }

private var _Medication: ImageVector? = null

