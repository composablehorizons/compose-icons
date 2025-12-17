package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Medication_liquid: ImageVector
    get() {
        if (_Medication_liquid != null) return _Medication_liquid!!
        
        _Medication_liquid = ImageVector.Builder(
            name = "medication_liquid",
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
                        moveTo(3f, 3f)
                        horizontalLineTo(15f)
                        verticalLineTo(5f)
                        horizontalLineTo(3f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 21f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(6f)
                        horizontalLineTo(2f)
                        verticalLineTo(21f)
                        close()
                        moveTo(5f, 12f)
                        horizontalLineToRelative(2.5f)
                        verticalLineTo(9.5f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(12f)
                        horizontalLineTo(13f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineToRelative(2.5f)
                        horizontalLineToRelative(-3f)
                        verticalLineTo(15f)
                        horizontalLineTo(5f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 6f)
                        curveToRelative(-1.68f, 0f, -3f, 1.76f, -3f, 4f)
                        curveToRelative(0f, 1.77f, 0.83f, 3.22f, 2f, 3.76f)
                        verticalLineTo(21f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-7.24f)
                        curveToRelative(1.17f, -0.54f, 2f, -1.99f, 2f, -3.76f)
                        curveTo(23f, 7.76f, 21.68f, 6f, 20f, 6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Medication_liquid!!
    }

private var _Medication_liquid: ImageVector? = null

