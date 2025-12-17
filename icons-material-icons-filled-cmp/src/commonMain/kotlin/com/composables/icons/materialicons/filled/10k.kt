package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`10k`: ImageVector
    get() {
        if (_10k != null) return _10k!!
        
        _10k = ImageVector.Builder(
            name = "10k",
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
                moveTo(10f, 10.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(10f)
                close()
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
                moveTo(7.5f, 15f)
                horizontalLineTo(6f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(5.5f, -1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(9.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveToRelative(6.5f, 1f)
                horizontalLineToRelative(-1.75f)
                lineTo(16f, 12.75f)
                verticalLineTo(15f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineToRelative(2.25f)
                lineTo(17.75f, 9f)
                horizontalLineToRelative(1.75f)
                lineToRelative(-2.25f, 3f)
                lineToRelative(2.25f, 3f)
                close()
            }
        }.build()
        
        return _10k!!
    }

private var _10k: ImageVector? = null

