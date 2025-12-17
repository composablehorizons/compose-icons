package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Card_giftcard: ImageVector
    get() {
        if (_Card_giftcard != null) return _Card_giftcard!!
        
        _Card_giftcard = ImageVector.Builder(
            name = "card_giftcard",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 6f)
                horizontalLineToRelative(-2.18f)
                curveToRelative(0.11f, -0.31f, 0.18f, -0.65f, 0.18f, -1f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                curveToRelative(-1.05f, 0f, -1.96f, 0.54f, -2.5f, 1.35f)
                lineToRelative(-0.5f, 0.67f)
                lineToRelative(-0.5f, -0.68f)
                curveTo(10.96f, 2.54f, 10.05f, 2f, 9f, 2f)
                curveTo(7.34f, 2f, 6f, 3.34f, 6f, 5f)
                curveToRelative(0f, 0.35f, 0.07f, 0.69f, 0.18f, 1f)
                horizontalLineTo(4f)
                curveToRelative(-1.11f, 0f, -1.99f, 0.89f, -1.99f, 2f)
                lineTo(2f, 19f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineTo(8f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                close()
                moveToRelative(-5f, -2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(9f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(11f, 15f)
                horizontalLineTo(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -5f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(5.08f)
                lineTo(7f, 10.83f)
                lineTo(8.62f, 12f)
                lineTo(11f, 8.76f)
                lineToRelative(1f, -1.36f)
                lineToRelative(1f, 1.36f)
                lineTo(15.38f, 12f)
                lineTo(17f, 10.83f)
                lineTo(14.92f, 8f)
                horizontalLineTo(20f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Card_giftcard!!
    }

private var _Card_giftcard: ImageVector? = null

