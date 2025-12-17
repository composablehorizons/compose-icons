package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`5k_plus`: ImageVector
    get() {
        if (_5k_plus != null) return _5k_plus!!
        
        _5k_plus = ImageVector.Builder(
            name = "5k_plus",
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
                moveToRelative(-9.5f, 7.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-1.75f, -2.25f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                lineTo(14.25f, 9f)
                horizontalLineTo(16f)
                lineToRelative(-2.25f, 3f)
                lineTo(16f, 15f)
                close()
                moveToRelative(4f, -2.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(16f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(10f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(20f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _5k_plus!!
    }

private var _5k_plus: ImageVector? = null

