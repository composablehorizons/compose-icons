package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Cottage: ImageVector
    get() {
        if (_Cottage != null) return _Cottage!!
        
        _Cottage = ImageVector.Builder(
            name = "cottage",
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
                moveTo(18f, 19f)
                lineTo(13f, 19f)
                lineTo(13f, 15f)
                lineTo(11f, 15f)
                lineTo(11f, 19f)
                lineTo(6f, 19f)
                lineTo(6f, 10.1f)
                lineTo(12f, 5.52f)
                lineTo(18f, 10.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                lineTo(6f, 7.58f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(3.11f)
                lineTo(1f, 11.4f)
                lineToRelative(1.21f, 1.59f)
                lineTo(4f, 11.62f)
                verticalLineTo(21f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-9.38f)
                lineToRelative(1.79f, 1.36f)
                lineTo(23f, 11.4f)
                lineTo(12f, 3f)
                close()
                moveTo(18f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineTo(6f)
                verticalLineToRelative(-8.9f)
                lineToRelative(6f, -4.58f)
                lineToRelative(6f, 4.58f)
                verticalLineTo(19f)
                close()
                moveTo(10f, 1f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                curveTo(6.45f, 4f, 6f, 4.45f, 6f, 5f)
                horizontalLineTo(4f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineTo(10f)
                close()
            }
        }.build()
        
        return _Cottage!!
    }

private var _Cottage: ImageVector? = null

