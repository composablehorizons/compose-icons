package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Generating_tokens: ImageVector
    get() {
        if (_Generating_tokens != null) return _Generating_tokens!!
        
        _Generating_tokens = ImageVector.Builder(
            name = "generating_tokens",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 4f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.58f, 8f, -8f)
                curveTo(17f, 7.58f, 13.42f, 4f, 9f, 4f)
                close()
                moveTo(12f, 10.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineTo(8f)
                verticalLineToRelative(-5f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineToRelative(6f)
                verticalLineTo(10.5f)
                close()
                moveTo(20.25f, 3.75f)
                lineTo(23f, 5f)
                lineToRelative(-2.75f, 1.25f)
                lineTo(19f, 9f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(15f, 5f)
                lineToRelative(2.75f, -1.25f)
                lineTo(19f, 1f)
                lineTo(20.25f, 3.75f)
                close()
                moveTo(20.25f, 17.75f)
                lineTo(23f, 19f)
                lineToRelative(-2.75f, 1.25f)
                lineTo(19f, 23f)
                lineToRelative(-1.25f, -2.75f)
                lineTo(15f, 19f)
                lineToRelative(2.75f, -1.25f)
                lineTo(19f, 15f)
                lineTo(20.25f, 17.75f)
                close()
            }
        }.build()
        
        return _Generating_tokens!!
    }

private var _Generating_tokens: ImageVector? = null

