package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Lte_plus_mobiledata: ImageVector
    get() {
        if (_Lte_plus_mobiledata != null) return _Lte_plus_mobiledata!!
        
        _Lte_plus_mobiledata = ImageVector.Builder(
            name = "lte_plus_mobiledata",
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
                        moveTo(3f, 14f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(1f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(14f)
                        close()
                        moveTo(5f, 10f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        horizontalLineTo(5f)
                        verticalLineTo(10f)
                        close()
                        moveTo(12f, 16f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-5f)
                        verticalLineTo(16f)
                        close()
                        moveTo(24f, 11f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Lte_plus_mobiledata!!
    }

private var _Lte_plus_mobiledata: ImageVector? = null

