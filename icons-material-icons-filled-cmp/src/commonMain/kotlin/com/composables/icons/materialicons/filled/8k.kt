package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`8k`: ImageVector
    get() {
        if (_8k != null) return _8k!!
        
        _8k = ImageVector.Builder(
            name = "8k",
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
                moveTo(8f, 12.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                close()
                moveTo(8f, 10f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(8f)
                close()
                moveToRelative(11f, -7f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-8f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(7.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(7f, 1f)
                horizontalLineToRelative(-1.75f)
                lineToRelative(-1.75f, -2.25f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                lineTo(16.25f, 9f)
                horizontalLineTo(18f)
                lineToRelative(-2.25f, 3f)
                lineTo(18f, 15f)
                close()
            }
        }.build()
        
        return _8k!!
    }

private var _8k: ImageVector? = null

