package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Align_horizontal_center: ImageVector
    get() {
        if (_Align_horizontal_center != null) return _Align_horizontal_center!!
        
        _Align_horizontal_center = ImageVector.Builder(
            name = "align_horizontal_center",
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
                moveTo(11f, 2f)
                lineTo(13f, 2f)
                lineTo(13f, 7f)
                lineTo(21f, 7f)
                lineTo(21f, 10f)
                lineTo(13f, 10f)
                lineTo(13f, 14f)
                lineTo(18f, 14f)
                lineTo(18f, 17f)
                lineTo(13f, 17f)
                lineTo(13f, 22f)
                lineTo(11f, 22f)
                lineTo(11f, 17f)
                lineTo(6f, 17f)
                lineTo(6f, 14f)
                lineTo(11f, 14f)
                lineTo(11f, 10f)
                lineTo(3f, 10f)
                lineTo(3f, 7f)
                lineTo(11f, 7f)
                close()
            }
        }.build()
        
        return _Align_horizontal_center!!
    }

private var _Align_horizontal_center: ImageVector? = null

