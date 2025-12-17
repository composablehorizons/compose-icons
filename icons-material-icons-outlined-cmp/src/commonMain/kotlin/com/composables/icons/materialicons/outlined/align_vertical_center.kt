package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Align_vertical_center: ImageVector
    get() {
        if (_Align_vertical_center != null) return _Align_vertical_center!!
        
        _Align_vertical_center = ImageVector.Builder(
            name = "align_vertical_center",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 11f)
                lineTo(17f, 11f)
                lineTo(17f, 6f)
                lineTo(14f, 6f)
                lineTo(14f, 11f)
                lineTo(10f, 11f)
                lineTo(10f, 3f)
                lineTo(7f, 3f)
                lineTo(7f, 11f)
                lineTo(1.84f, 11f)
                lineTo(1.84f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 21f)
                lineTo(10f, 21f)
                lineTo(10f, 13f)
                lineTo(14f, 13f)
                lineTo(14f, 18f)
                lineTo(17f, 18f)
                lineTo(17f, 13f)
                lineTo(22f, 13f)
                close()
            }
        }.build()
        
        return _Align_vertical_center!!
    }

private var _Align_vertical_center: ImageVector? = null

