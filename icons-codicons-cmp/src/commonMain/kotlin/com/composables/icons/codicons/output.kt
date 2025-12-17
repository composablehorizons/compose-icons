package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Output: ImageVector
    get() {
        if (_Output != null) return _Output!!
        
        _Output = ImageVector.Builder(
            name = "output",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.25f, 8.06775f)
                curveTo(7.836f, 8.06775f, 7.5f, 8.40375f, 7.5f, 8.81775f)
                curveTo(7.5f, 9.23175f, 7.836f, 9.56775f, 8.25f, 9.56775f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 9.56775f, 16.5f, 9.23175f, 16.5f, 8.81775f)
                curveTo(16.5f, 8.40375f, 16.164f, 8.06775f, 15.75f, 8.06775f)
                horizontalLineTo(8.25f)
                close()
                moveTo(7.5f, 13.3177f)
                curveTo(7.5f, 12.9037f, 7.836f, 12.5677f, 8.25f, 12.5677f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 12.5677f, 16.5f, 12.9037f, 16.5f, 13.3177f)
                curveTo(16.5f, 13.7317f, 16.164f, 14.0677f, 15.75f, 14.0677f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 14.0677f, 7.5f, 13.7317f, 7.5f, 13.3177f)
                close()
                moveTo(8.25f, 17.0677f)
                curveTo(7.836f, 17.0677f, 7.5f, 17.4037f, 7.5f, 17.8177f)
                curveTo(7.5f, 18.2317f, 7.836f, 18.5677f, 8.25f, 18.5677f)
                horizontalLineTo(11.25f)
                curveTo(11.664f, 18.5677f, 12f, 18.2317f, 12f, 17.8177f)
                curveTo(12f, 17.4037f, 11.664f, 17.0677f, 11.25f, 17.0677f)
                horizontalLineTo(8.25f)
                close()
                moveTo(6.75f, 0.567749f)
                curveTo(6.336f, 0.567749f, 6f, 0.903749f, 6f, 1.31775f)
                verticalLineTo(2.06775f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 2.06775f, 3f, 3.07475f, 3f, 4.31775f)
                verticalLineTo(22.3177f)
                curveTo(3f, 23.5607f, 4.007f, 24.5677f, 5.25f, 24.5677f)
                horizontalLineTo(14.25f)
                curveTo(14.449f, 24.5677f, 14.64f, 24.4888f, 14.78f, 24.3477f)
                lineTo(20.78f, 18.3477f)
                curveTo(20.921f, 18.2067f, 21f, 18.0167f, 21f, 17.8177f)
                verticalLineTo(4.31775f)
                curveTo(21f, 3.07475f, 19.993f, 2.06775f, 18.75f, 2.06775f)
                horizontalLineTo(18f)
                verticalLineTo(1.31775f)
                curveTo(18f, 0.903749f, 17.664f, 0.567749f, 17.25f, 0.567749f)
                curveTo(16.836f, 0.567749f, 16.5f, 0.903749f, 16.5f, 1.31775f)
                verticalLineTo(2.06775f)
                horizontalLineTo(12.75f)
                verticalLineTo(1.31775f)
                curveTo(12.75f, 0.903749f, 12.414f, 0.567749f, 12f, 0.567749f)
                curveTo(11.586f, 0.567749f, 11.25f, 0.903749f, 11.25f, 1.31775f)
                verticalLineTo(2.06775f)
                horizontalLineTo(7.5f)
                verticalLineTo(1.31775f)
                curveTo(7.5f, 0.903749f, 7.164f, 0.567749f, 6.75f, 0.567749f)
                close()
                moveTo(18.75f, 3.56775f)
                curveTo(19.164f, 3.56775f, 19.5f, 3.90375f, 19.5f, 4.31775f)
                verticalLineTo(17.0677f)
                horizontalLineTo(15.75f)
                curveTo(14.507f, 17.0677f, 13.5f, 18.0747f, 13.5f, 19.3177f)
                verticalLineTo(23.0677f)
                horizontalLineTo(5.25f)
                curveTo(4.836f, 23.0677f, 4.5f, 22.7317f, 4.5f, 22.3177f)
                verticalLineTo(4.31775f)
                curveTo(4.5f, 3.90375f, 4.836f, 3.56775f, 5.25f, 3.56775f)
                horizontalLineTo(18.75f)
                close()
                moveTo(18.439f, 18.5677f)
                lineTo(15f, 22.0067f)
                verticalLineTo(19.3177f)
                curveTo(15f, 18.9037f, 15.336f, 18.5677f, 15.75f, 18.5677f)
                horizontalLineTo(18.439f)
                close()
            }
        }.build()
        
        return _Output!!
    }

private var _Output: ImageVector? = null

