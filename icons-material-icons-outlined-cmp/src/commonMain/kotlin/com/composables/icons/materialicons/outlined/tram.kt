package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Tram: ImageVector
    get() {
        if (_Tram != null) return _Tram!!
        
        _Tram = ImageVector.Builder(
            name = "tram",
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
                moveTo(13f, 5f)
                lineToRelative(0.75f, -1.5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.75f)
                lineTo(11f, 5f)
                curveToRelative(-3.13f, 0.09f, -6f, 0.73f, -6f, 3.5f)
                verticalLineTo(17f)
                curveToRelative(0f, 1.5f, 1.11f, 2.73f, 2.55f, 2.95f)
                lineTo(6f, 21.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(4f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-1.55f, -1.55f)
                horizontalLineToRelative(-0.01f)
                horizontalLineToRelative(0.01f)
                curveTo(17.89f, 19.73f, 19f, 18.5f, 19f, 17f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -2.77f, -2.87f, -3.41f, -6f, -3.5f)
                close()
                moveToRelative(-1.97f, 2f)
                horizontalLineToRelative(1.94f)
                curveToRelative(2.75f, 0.08f, 3.62f, 0.58f, 3.9f, 1f)
                horizontalLineTo(7.13f)
                curveToRelative(0.28f, -0.42f, 1.15f, -0.92f, 3.9f, -1f)
                close()
                moveToRelative(-0.18f, 10.95f)
                horizontalLineTo(7.74f)
                curveTo(7.3f, 17.84f, 7f, 17.45f, 7f, 17f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.89f)
                curveToRelative(-0.24f, 0.27f, -0.39f, 0.61f, -0.39f, 1f)
                curveToRelative(0f, 0.36f, 0.13f, 0.69f, 0.35f, 0.95f)
                close()
                moveTo(17f, 17f)
                curveToRelative(0f, 0.45f, -0.3f, 0.84f, -0.74f, 0.95f)
                horizontalLineToRelative(-3.11f)
                curveToRelative(0.22f, -0.26f, 0.35f, -0.59f, 0.35f, -0.95f)
                curveToRelative(0f, -0.39f, -0.15f, -0.73f, -0.39f, -1f)
                horizontalLineTo(17f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(0f, -3f)
                horizontalLineTo(7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                close()
            }
        }.build()
        
        return _Tram!!
    }

private var _Tram: ImageVector? = null

