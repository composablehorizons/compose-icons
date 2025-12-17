package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ThumbsUp: ImageVector
    get() {
        if (_ThumbsUp != null) return _ThumbsUp!!
        
        _ThumbsUp = ImageVector.Builder(
            name = "thumbs-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(104f, 224f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(80f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(248f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
                moveTo(64f, 472f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                reflectiveCurveToRelative(10.745f, -24f, 24f, -24f)
                reflectiveCurveToRelative(24f, 10.745f, 24f, 24f)
                reflectiveCurveToRelative(-10.745f, 24f, -24f, 24f)
                close()
                moveTo(384f, 81.452f)
                curveToRelative(0f, 42.416f, -25.97f, 66.208f, -33.277f, 94.548f)
                horizontalLineToRelative(101.723f)
                curveToRelative(33.397f, 0f, 59.397f, 27.746f, 59.553f, 58.098f)
                curveToRelative(0.084f, 17.938f, -7.546f, 37.249f, -19.439f, 49.197f)
                lineToRelative(-0.11f, 0.11f)
                curveToRelative(9.836f, 23.337f, 8.237f, 56.037f, -9.308f, 79.469f)
                curveToRelative(8.681f, 25.895f, -0.069f, 57.704f, -16.382f, 74.757f)
                curveToRelative(4.298f, 17.598f, 2.244f, 32.575f, -6.148f, 44.632f)
                curveTo(440.202f, 511.587f, 389.616f, 512f, 346.839f, 512f)
                lineToRelative(-2.845f, -0.001f)
                curveToRelative(-48.287f, -0.017f, -87.806f, -17.598f, -119.56f, -31.725f)
                curveToRelative(-15.957f, -7.099f, -36.821f, -15.887f, -52.651f, -16.178f)
                curveToRelative(-6.54f, -0.12f, -11.783f, -5.457f, -11.783f, -11.998f)
                verticalLineToRelative(-213.77f)
                curveToRelative(0f, -3.2f, 1.282f, -6.271f, 3.558f, -8.521f)
                curveToRelative(39.614f, -39.144f, 56.648f, -80.587f, 89.117f, -113.111f)
                curveToRelative(14.804f, -14.832f, 20.188f, -37.236f, 25.393f, -58.902f)
                curveTo(282.515f, 39.293f, 291.817f, 0f, 312f, 0f)
                curveToRelative(24f, 0f, 72f, 8f, 72f, 81.452f)
                close()
            }
        }.build()
        
        return _ThumbsUp!!
    }

private var _ThumbsUp: ImageVector? = null

