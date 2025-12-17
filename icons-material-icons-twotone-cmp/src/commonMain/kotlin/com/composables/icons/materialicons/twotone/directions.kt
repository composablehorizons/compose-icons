package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Directions: ImageVector
    get() {
        if (_Directions != null) return _Directions!!
        
        _Directions = ImageVector.Builder(
            name = "directions",
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
                moveTo(3.01f, 12f)
                lineToRelative(9f, 9f)
                lineTo(21f, 12f)
                lineToRelative(-9f, -9f)
                lineToRelative(-8.99f, 9f)
                close()
                moveTo(14f, 7.5f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(-3.5f, 3.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                verticalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.42f, 1.58f)
                curveToRelative(-0.75f, -0.75f, -2.07f, -0.76f, -2.83f, 0f)
                lineToRelative(-9f, 9f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.04f, 0f, 2.82f)
                lineToRelative(9f, 9f)
                curveToRelative(0.39f, 0.39f, 0.9f, 0.58f, 1.41f, 0.58f)
                curveToRelative(0.51f, 0f, 1.02f, -0.19f, 1.41f, -0.58f)
                lineToRelative(8.99f, -8.99f)
                curveToRelative(0.78f, -0.76f, 0.79f, -2.03f, 0.02f, -2.82f)
                lineToRelative(-9f, -9.01f)
                close()
                moveToRelative(-1.41f, 19.41f)
                lineToRelative(-9f, -9f)
                lineToRelative(9f, -9f)
                lineToRelative(9f, 9f)
                lineToRelative(-9f, 9f)
                close()
                moveTo(8f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.5f, -3.5f)
                lineTo(14f, 7.5f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.build()
        
        return _Directions!!
    }

private var _Directions: ImageVector? = null

