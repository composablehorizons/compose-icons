package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Balcony: ImageVector
    get() {
        if (_Balcony != null) return _Balcony!!
        
        _Balcony = ImageVector.Builder(
            name = "balcony",
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
                moveTo(7f, 16f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
                moveTo(11f, 16f)
                horizontalLineTo(9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
                moveTo(6f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineTo(4.08f)
                curveTo(8.16f, 4.56f, 6f, 7.03f, 6f, 10f)
                close()
                moveTo(10f, 12f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                close()
                moveTo(13f, 4.08f)
                verticalLineTo(14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                curveTo(18f, 7.03f, 15.84f, 4.56f, 13f, 4.08f)
                close()
                moveTo(16f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(12f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 10f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(-2f)
                horizontalLineTo(10f)
                close()
                moveTo(16f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineTo(16f)
                close()
                moveTo(21f, 14f)
                verticalLineToRelative(8f)
                horizontalLineTo(3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.58f, 8f, 8f)
                verticalLineToRelative(4f)
                horizontalLineTo(21f)
                close()
                moveTo(7f, 16f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
                moveTo(11f, 16f)
                horizontalLineTo(9f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
                moveTo(11f, 4.08f)
                curveTo(8.16f, 4.56f, 6f, 7.03f, 6f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineTo(4.08f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.97f, -2.16f, -5.44f, -5f, -5.92f)
                verticalLineTo(14f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineTo(16f)
                close()
            }
        }.build()
        
        return _Balcony!!
    }

private var _Balcony: ImageVector? = null

