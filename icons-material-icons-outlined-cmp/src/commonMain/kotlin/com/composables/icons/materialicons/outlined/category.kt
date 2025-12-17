package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Category: ImageVector
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
                moveTo(3f, 21.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                horizontalLineTo(3f)
                verticalLineToRelative(8f)
                close()
                moveToRelative(2f, -6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _Category!!
    }

private var _Category: ImageVector? = null

