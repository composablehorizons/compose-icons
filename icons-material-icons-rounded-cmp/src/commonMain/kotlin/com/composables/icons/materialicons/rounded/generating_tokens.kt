package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Generating_tokens: ImageVector
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
                moveTo(9f, 15.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineTo(6.75f)
                curveTo(6.34f, 10.5f, 6f, 10.16f, 6f, 9.75f)
                reflectiveCurveTo(6.34f, 9f, 6.75f, 9f)
                horizontalLineToRelative(4.5f)
                curveTo(11.66f, 9f, 12f, 9.34f, 12f, 9.75f)
                reflectiveCurveToRelative(-0.34f, 0.75f, -0.75f, 0.75f)
                horizontalLineTo(10f)
                verticalLineToRelative(4f)
                curveTo(10f, 15.05f, 9.55f, 15.5f, 9f, 15.5f)
                close()
                moveTo(20.25f, 3.75f)
                lineTo(22f, 4.54f)
                curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0f, 0.91f)
                lineToRelative(-1.75f, 0.79f)
                lineTo(19.46f, 8f)
                curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0f)
                lineToRelative(-0.79f, -1.75f)
                lineTo(16f, 5.46f)
                curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0f, -0.91f)
                lineToRelative(1.75f, -0.79f)
                lineTo(18.54f, 2f)
                curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0f)
                lineTo(20.25f, 3.75f)
                close()
                moveTo(20.25f, 17.75f)
                lineTo(22f, 18.54f)
                curveToRelative(0.39f, 0.18f, 0.39f, 0.73f, 0f, 0.91f)
                lineToRelative(-1.75f, 0.79f)
                lineTo(19.46f, 22f)
                curveToRelative(-0.18f, 0.39f, -0.73f, 0.39f, -0.91f, 0f)
                lineToRelative(-0.79f, -1.75f)
                lineTo(16f, 19.46f)
                curveToRelative(-0.39f, -0.18f, -0.39f, -0.73f, 0f, -0.91f)
                lineToRelative(1.75f, -0.79f)
                lineTo(18.54f, 16f)
                curveToRelative(0.18f, -0.39f, 0.73f, -0.39f, 0.91f, 0f)
                lineTo(20.25f, 17.75f)
                close()
            }
        }.build()
        
        return _Generating_tokens!!
    }

private var _Generating_tokens: ImageVector? = null

