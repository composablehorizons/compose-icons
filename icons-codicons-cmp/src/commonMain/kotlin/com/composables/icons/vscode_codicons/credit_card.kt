package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CreditCard: ImageVector
    get() {
        if (_CreditCard != null) return _CreditCard!!
        
        _CreditCard = ImageVector.Builder(
            name = "credit-card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 10f)
                curveTo(10.2239f, 10f, 10f, 10.2239f, 10f, 10.5f)
                curveTo(10f, 10.7761f, 10.2239f, 11f, 10.5f, 11f)
                horizontalLineTo(12.5f)
                curveTo(12.7761f, 11f, 13f, 10.7761f, 13f, 10.5f)
                curveTo(13f, 10.2239f, 12.7761f, 10f, 12.5f, 10f)
                horizontalLineTo(10.5f)
                close()
                moveTo(1f, 5.5f)
                curveTo(1f, 4.11929f, 2.11929f, 3f, 3.5f, 3f)
                horizontalLineTo(12.5f)
                curveTo(13.8807f, 3f, 15f, 4.11929f, 15f, 5.5f)
                verticalLineTo(10.5f)
                curveTo(15f, 11.8807f, 13.8807f, 13f, 12.5f, 13f)
                horizontalLineTo(3.5f)
                curveTo(2.11929f, 13f, 1f, 11.8807f, 1f, 10.5f)
                verticalLineTo(5.5f)
                close()
                moveTo(14f, 6f)
                verticalLineTo(5.5f)
                curveTo(14f, 4.67157f, 13.3284f, 4f, 12.5f, 4f)
                horizontalLineTo(3.5f)
                curveTo(2.67157f, 4f, 2f, 4.67157f, 2f, 5.5f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                close()
                moveTo(2f, 7f)
                verticalLineTo(10.5f)
                curveTo(2f, 11.3284f, 2.67157f, 12f, 3.5f, 12f)
                horizontalLineTo(12.5f)
                curveTo(13.3284f, 12f, 14f, 11.3284f, 14f, 10.5f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _CreditCard!!
    }

private var _CreditCard: ImageVector? = null

