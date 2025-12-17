package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`1k_plus`: ImageVector
    get() {
        if (_1k_plus != null) return _1k_plus!!
        
        _1k_plus = ImageVector.Builder(
            name = "1k_plus",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(9f, 15f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(4.75f, 0f)
                lineTo(12f, 12.75f)
                verticalLineTo(15f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineToRelative(2.25f)
                lineTo(13.75f, 9f)
                horizontalLineToRelative(1.75f)
                lineToRelative(-2.25f, 3f)
                lineToRelative(2.25f, 3f)
                horizontalLineToRelative(-1.75f)
                close()
                moveToRelative(5.75f, -2.5f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _1k_plus!!
    }

private var _1k_plus: ImageVector? = null

