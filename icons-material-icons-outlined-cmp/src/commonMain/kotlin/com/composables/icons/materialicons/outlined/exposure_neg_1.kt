package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Exposure_neg_1: ImageVector
    get() {
        if (_Exposure_neg_1 != null) return _Exposure_neg_1!!
        
        _Exposure_neg_1 = ImageVector.Builder(
            name = "exposure_neg_1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(15f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7.38f)
                lineTo(14f, 8.4f)
                verticalLineTo(6.7f)
                lineTo(18.7f, 5f)
                horizontalLineToRelative(0.3f)
                verticalLineToRelative(13f)
                close()
            }
        }.build()
        
        return _Exposure_neg_1!!
    }

private var _Exposure_neg_1: ImageVector? = null

