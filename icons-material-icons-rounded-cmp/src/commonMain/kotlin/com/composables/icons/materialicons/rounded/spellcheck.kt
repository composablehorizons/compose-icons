package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Spellcheck: ImageVector
    get() {
        if (_Spellcheck != null) return _Spellcheck!!
        
        _Spellcheck = ImageVector.Builder(
            name = "spellcheck",
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
                moveTo(13.12f, 16f)
                curveToRelative(0.69f, 0f, 1.15f, -0.69f, 0.9f, -1.32f)
                lineTo(9.77f, 3.87f)
                curveTo(9.56f, 3.34f, 9.06f, 3f, 8.5f, 3f)
                reflectiveCurveToRelative(-1.06f, 0.34f, -1.27f, 0.87f)
                lineTo(2.98f, 14.68f)
                curveToRelative(-0.25f, 0.63f, 0.22f, 1.32f, 0.9f, 1.32f)
                curveToRelative(0.4f, 0f, 0.76f, -0.25f, 0.91f, -0.63f)
                lineTo(5.67f, 13f)
                horizontalLineToRelative(5.64f)
                lineToRelative(0.9f, 2.38f)
                curveToRelative(0.15f, 0.37f, 0.51f, 0.62f, 0.91f, 0.62f)
                close()
                moveToRelative(-6.69f, -5f)
                lineTo(8.5f, 5.48f)
                lineTo(10.57f, 11f)
                horizontalLineTo(6.43f)
                close()
                moveToRelative(14.46f, 1.29f)
                lineToRelative(-7.39f, 7.39f)
                lineToRelative(-2.97f, -2.97f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(3.68f, 3.68f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(8.08f, -8.09f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(-0.38f, -0.39f, -1.02f, -0.39f, -1.4f, -0.01f)
                close()
            }
        }.build()
        
        return _Spellcheck!!
    }

private var _Spellcheck: ImageVector? = null

