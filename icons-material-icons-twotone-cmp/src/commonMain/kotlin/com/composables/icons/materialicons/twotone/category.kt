package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Category: ImageVector
    get() {
        if (_Category != null) return _Category!!
        
        _Category = ImageVector.Builder(
            name = "category",
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
                moveTo(20f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 17.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, false, true, 15f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 20f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 15.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                close()
                moveToRelative(7f, -9.66f)
                lineTo(10.07f, 9f)
                horizontalLineToRelative(3.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(-5.5f, 9f)
                horizontalLineToRelative(11f)
                lineTo(12f, 2f)
                close()
                moveToRelative(0f, 3.84f)
                lineTo(13.93f, 9f)
                horizontalLineToRelative(-3.87f)
                lineTo(12f, 5.84f)
                close()
                moveTo(17.5f, 13f)
                curveToRelative(-2.49f, 0f, -4.5f, 2.01f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.01f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.01f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.01f, -4.5f, -4.5f, -4.5f)
                close()
                moveToRelative(0f, 7f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(11f, 13.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                close()
                moveToRelative(-2f, 6f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Category!!
    }

private var _Category: ImageVector? = null

