package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Horizontal_rule: ImageVector
    get() {
        if (_Horizontal_rule != null) return _Horizontal_rule!!
        
        _Horizontal_rule = ImageVector.Builder(
            name = "horizontal_rule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 11f)
                    horizontalLineTo(20f)
                    verticalLineTo(13f)
                    horizontalLineTo(4f)
                    verticalLineTo(11f)
                    close()
                }
            }
        }.build()
        
        return _Horizontal_rule!!
    }

private var _Horizontal_rule: ImageVector? = null

