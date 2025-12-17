package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Lte_mobiledata: ImageVector
    get() {
        if (_Lte_mobiledata != null) return _Lte_mobiledata!!
        
        _Lte_mobiledata = ImageVector.Builder(
            name = "lte_mobiledata",
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
                        moveTo(6f, 14f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(4f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(14f)
                        close()
                        moveTo(9f, 10f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-6f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        horizontalLineTo(9f)
                        verticalLineTo(10f)
                        close()
                        moveTo(21f, 10f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-5f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(5f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(-1f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(-1f)
                        horizontalLineTo(21f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Lte_mobiledata!!
    }

private var _Lte_mobiledata: ImageVector? = null

