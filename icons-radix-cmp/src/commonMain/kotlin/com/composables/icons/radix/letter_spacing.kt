package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LetterSpacing: ImageVector
    get() {
        if (_LetterSpacing != null) return _LetterSpacing!!
        
        _LetterSpacing = ImageVector.Builder(
            name = "letter-spacing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.2709f, 10.2168f)
                curveTo(12.4271f, 10.0607f, 12.6811f, 10.0606f, 12.8373f, 10.2168f)
                lineTo(14.8373f, 12.2168f)
                lineTo(14.8871f, 12.2783f)
                curveTo(14.9304f, 12.3434f, 14.9545f, 12.4206f, 14.9545f, 12.5f)
                curveTo(14.9545f, 12.606f, 14.9122f, 12.7082f, 14.8373f, 12.7832f)
                lineTo(12.8373f, 14.7832f)
                lineTo(12.7738f, 14.8339f)
                curveTo(12.6186f, 14.9363f, 12.4075f, 14.9196f, 12.2709f, 14.7832f)
                curveTo(12.1342f, 14.6465f, 12.1177f, 14.4355f, 12.2201f, 14.2802f)
                lineTo(12.2709f, 14.2168f)
                lineTo(13.5873f, 12.9004f)
                horizontalLineTo(1.52087f)
                lineTo(2.83728f, 14.2168f)
                curveTo(2.99321f, 14.3729f, 2.99325f, 14.627f, 2.83728f, 14.7832f)
                curveTo(2.68115f, 14.9393f, 2.4271f, 14.9392f, 2.27087f, 14.7832f)
                lineTo(0.270874f, 12.7832f)
                curveTo(0.195874f, 12.7082f, 0.153703f, 12.606f, 0.153687f, 12.5f)
                curveTo(0.153687f, 12.3939f, 0.19586f, 12.2918f, 0.270874f, 12.2168f)
                lineTo(2.27087f, 10.2168f)
                lineTo(2.33435f, 10.166f)
                curveTo(2.48957f, 10.0638f, 2.70073f, 10.0802f, 2.83728f, 10.2168f)
                curveTo(2.97366f, 10.3534f, 2.99027f, 10.5645f, 2.88806f, 10.7197f)
                lineTo(2.83728f, 10.7832f)
                lineTo(1.52087f, 12.0996f)
                horizontalLineTo(13.5873f)
                lineTo(12.2709f, 10.7832f)
                curveTo(12.1147f, 10.627f, 12.1147f, 10.373f, 12.2709f, 10.2168f)
                close()
                moveTo(13.389f, 1.22653f)
                curveTo(13.5158f, 1.03205f, 13.766f, 0.946105f, 13.9906f, 1.03414f)
                curveTo(14.2153f, 1.12246f, 14.3399f, 1.35597f, 14.3002f, 1.58493f)
                lineTo(14.2728f, 1.68258f)
                lineTo(11.5209f, 8.68453f)
                curveTo(11.4457f, 8.87576f, 11.2615f, 9.00185f, 11.056f, 9.00192f)
                curveTo(10.8761f, 9.00181f, 10.7118f, 8.90531f, 10.6234f, 8.75289f)
                lineTo(10.5902f, 8.68453f)
                lineTo(7.83826f, 1.68258f)
                curveTo(7.73772f, 1.42579f, 7.86478f, 1.13514f, 8.12146f, 1.03414f)
                curveTo(8.37828f, 0.933439f, 8.66884f, 1.06065f, 8.7699f, 1.31735f)
                lineTo(11.0551f, 7.13571f)
                lineTo(13.3422f, 1.31735f)
                lineTo(13.389f, 1.22653f)
                close()
                moveTo(4.5531f, 0.999964f)
                curveTo(4.75278f, 1.00015f, 4.93326f, 1.11923f, 5.01208f, 1.3027f)
                lineTo(8.01111f, 8.29977f)
                lineTo(8.04138f, 8.39645f)
                curveTo(8.08822f, 8.6241f, 7.97026f, 8.86075f, 7.74841f, 8.95602f)
                curveTo(7.52641f, 9.05102f, 7.27356f, 8.97313f, 7.14099f, 8.78219f)
                lineTo(7.09119f, 8.69332f)
                lineTo(6.1156f, 6.41696f)
                horizontalLineTo(2.98962f)
                lineTo(2.01404f, 8.69332f)
                lineTo(1.96423f, 8.78219f)
                curveTo(1.83159f, 8.97309f, 1.57882f, 9.05116f, 1.35681f, 8.95602f)
                curveTo(1.1035f, 8.84706f, 0.985587f, 8.55333f, 1.09412f, 8.29977f)
                lineTo(4.09314f, 1.3027f)
                lineTo(4.12732f, 1.23727f)
                curveTo(4.21739f, 1.09137f, 4.3782f, 1.00007f, 4.5531f, 0.999964f)
                close()
                moveTo(3.35291f, 5.56735f)
                horizontalLineTo(5.75134f)
                lineTo(4.55212f, 2.76852f)
                lineTo(3.35291f, 5.56735f)
                close()
            }
        }.build()
        
        return _LetterSpacing!!
    }

private var _LetterSpacing: ImageVector? = null

