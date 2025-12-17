package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.`19mp`: ImageVector
    get() {
        if (_19mp != null) return _19mp!!
        
        _19mp = ImageVector.Builder(
            name = "19mp",
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
                moveToRelative(-7f, 7f)
                horizontalLineToRelative(3f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                close()
                moveToRelative(1.5f, -2f)
                horizontalLineTo(15f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(8f)
                close()
                moveTo(7f, 5.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineTo(8.5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(5.5f)
                close()
                moveToRelative(5f, 13f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                horizontalLineTo(7f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(5.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(6.5f, -2.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(16f)
                close()
                moveToRelative(-3f, -2f)
                horizontalLineTo(17f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }.build()
        
        return _19mp!!
    }

private var _19mp: ImageVector? = null

